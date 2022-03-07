package Patterns.Generative.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1,"SourceCode sourceCode = new SourceCode();\n","SuperProject");
        System.out.println(project);

       ProjectFactory projectFactory = new ProjectFactory(project);
       Project clone = projectFactory.cloneProject();
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(clone);

    }

}
