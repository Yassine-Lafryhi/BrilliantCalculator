package me.brilliant.calculator;

public class Expression {
    public static double evaluate(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();
                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        case "arcsin":
                            x = Math.asin(Math.toRadians(x));
                            break;
                        case "arccos":
                            x = Math.acos(Math.toRadians(x));
                            break;
                        case "arctan":
                            x = Math.atan(Math.toRadians(x));
                            break;
                        case "abs":
                            x = Math.abs(x);
                            break;
                        case "ln":
                            x = Math.log(x);
                            break;
                        case "log":
                            x = Math.log10(x);
                            break;
                        case "cbrt":
                            x = Math.cbrt(x);
                            break;
                        case "cosh":
                            x = Math.cosh(x);
                            break;
                        case "sinh":
                            x = Math.sinh(x);
                            break;
                        case "tanh":
                            x = Math.tanh(x);
                            break;
                        case "rand":
                            x = Math.random();
                            break;
                        case "exp":
                            x = Math.exp(x);
                            break;
                        case "tobin":
                            x = Double.parseDouble(Long.toBinaryString(Long.parseLong(String.valueOf((long)x))));
                            break;
                        case "tohex":
                            x = Double.parseDouble(Long.toHexString(Long.parseLong(String.valueOf((long)x))));
                            break;
                        case "tooct":
                            x = Double.parseDouble(Long.toOctalString(Long.parseLong(String.valueOf((long)x))));
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;
            }
        }.parse();
    }
}
