/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.TaskQueue;

import java.util.ArrayList;

/**
 *
 * @author thomas
 */
public class TaskQueue {
    ArrayList<Task> taskQueue;
    //add workRequestID

    public TaskQueue() {
        taskQueue=new ArrayList<Task>();
    }

    public ArrayList<Task> getWorkQueue() {
        return taskQueue;
    }

    public void setWorkQueue(ArrayList<Task> workQueue) {
        this.taskQueue = workQueue;
    }
    
    public void addWorkRequesttoQueue(Task workRequest)
    {
        taskQueue.add(workRequest);
    }
    
    public void removeWorkRequestfromQueue(Task workRequest)
    {
        taskQueue.remove(workRequest);
    }
    
}
