import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private final ArrayList<String> tasks;
    Scanner taskManager = new Scanner(System.in);

    public TaskList () {
        this.tasks = new ArrayList<>();
    }

    public void addTask(){
        System.out.println("Qual task quer fazer?");
        String taskMan = taskManager.nextLine();
        this.tasks.add(taskMan);
    }

    public void removeTask(){
        System.out.println("Qual task quer remover?");
        String taskMan = taskManager.nextLine();
        this.tasks.remove(taskMan);
    }

    public void taskList() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (String taskName : tasks) {
                System.out.println("=================");
                System.out.println("- " + taskName);
                System.out.println("=================");
            }
        }
    }
    // para poder exportar para TXT

    public void exportTasks(String filename){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (int i = 0; i < tasks.size();i++){
                writer.write((i+1) + "." + tasks.get(i));
                writer.newLine();
            }
            System.out.println("Tarefas exportadas com sucesso para"+ filename);
        } catch (IOException e){
            System.out.println("Erro ao exportar tarefas" + e.getMessage());
        }
    }
}
