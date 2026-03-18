function addtask(){
    var input = document.getElementById("task");
    var taskValue = input.value;
    
    if (taskValue.trim() === "") {
        alert("Please enter a task!");
        return;
    }

    var taskList = document.getElementById("task-list");
    var li = document.createElement("li");
    li.className = "list-group-item";
    li.innerText = taskValue;
    
    taskList.appendChild(li);
    input.value = "";
}