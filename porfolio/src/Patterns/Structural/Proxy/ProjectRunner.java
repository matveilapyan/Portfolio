package Patterns.Structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("ggggg");
        project.run();

    }
}
