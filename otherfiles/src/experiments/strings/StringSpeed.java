package experiments.strings;

/**
 * Created by Alexey Dvoryaninov on 08.07.2018 - (lexxzone@gmail.com)
 */
public class StringSpeed {

    public String stringAppend() {
        String s = "foo";
        s += ", bar";
        s += ", baz";
        s += ", qux";
        s += ", bar";
        s += ", bar";
        s += ", bar";
        s += ", bar";
        s += ", bar";
        s += ", bar";
        s += ", baz";
        s += ", qux";
        s += ", baz";
        s += ", qux";
        s += ", baz";
        s += ", qux";
        s += ", baz";
        s += ", qux";
        s += ", baz";
        s += ", qux";
        s += ", baz";
        s += ", qux";

        return s;
    }

    public String stringAppendBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("foo");
        sb.append(", bar");
        sb.append(", bar");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");
        sb.append(", baz");
        sb.append(", qux");

        return sb.toString();
    }

    public String stringAppendBuilder2() {
        StringBuilder sb = new StringBuilder();
        sb.append("foo")
                .append(", bar")
                .append(", bar")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux")
                .append(", baz")
                .append(", qux");

        return sb.toString();
    }

    public static void main(String[] args) {
        StringSpeed ss = new StringSpeed();

        //System.out.println(ss.stringAppend());
        //System.out.println(ss.stringAppendBuilder());
        System.out.println(ss.stringAppendBuilder2());
    }


}
