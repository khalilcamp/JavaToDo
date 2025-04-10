import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner taskChoice = new Scanner(System.in);
        TaskList taskName = new TaskList();

        while(true){
            System.out.println("=========");
            System.out.println("Seja bem vindo à To-Do-List");
            System.out.println("=========");

            System.out.println("O que gostaria de fazer hoje?");
            System.out.println("1. Ver sua lista");
            System.out.println("2. Adicionar uma nova task");
            System.out.println("3. Remover uma task");
            System.out.println("4. Exportar a lista para arquivo.");
            System.out.println("Outros. Exit");
            int choiceTask;
            try{
                choiceTask = Integer.parseInt(taskChoice.nextLine());
            } catch (NumberFormatException e){
                break;
            }


            switch (choiceTask){
                case 1:
                    System.out.println("Sua lista de tarefas é:");
                    taskName.taskList();
                    break;
                case 2:
                    taskName.addTask();
                    break;
                case 3:
                    taskName.removeTask();
                    break;
                case 4:
                    taskName.exportTasks("C:\\Path");
                    break;
                default:
                    return;
            }
        }
//Ste


    }
}