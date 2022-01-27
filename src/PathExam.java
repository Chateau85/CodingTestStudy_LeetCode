import java.util.Stack;

public class PathExam {
    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("/x");
        System.out.println(path.current_path);
    }

    static class Path {
        public String current_path = "";
        public Stack<String> pathes;

        public Path(String s) {
            if (isOnlyAlphabet(s)) {
                this.current_path = s;
            } else {
                pathes = new Stack<>();
                String[] temp = s.split("/");
                for (String str : temp) {
                    pathes.push(str);
                }
            }
        }

        private boolean isOnlyAlphabet(String s) {
            char[] arr = s.toCharArray();
            boolean isOnlyAlphabet = true;
            for (char c : arr) {
                if (!Character.isAlphabetic(c)) {
                    isOnlyAlphabet = false;
                }
            }
            return isOnlyAlphabet;
        }

        public void cd(String s) {
            String[] new_pathes;
            if (!isOnlyAlphabet(s)) {
                new_pathes = s.split("/");
                if (s.contains("..")) {
                    for (String str : new_pathes) {
                        if (str.equals("..")) {
                            pathes.pop();
                        } else {
                            pathes.push(str);
                        }
                    }
                    current_path = String.join("/", this.pathes);
                } else if (s.equals("/")) {
                    this.pathes.setSize(0);
                    current_path = "/";
                } else {
                    System.out.println("Wrong Path");
                }
            }
        }
    }
}
