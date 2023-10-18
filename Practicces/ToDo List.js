/*Make a Todo List in which users can

1. Add a task to the list
2. Delete a task from the list
3. Mark a task as completed

1. Add a task to the list: The users will type a task in the text input box and when they click on the ADD button, a div element should get added within the < ul class="todo-list"> </ul>
Note: Use preventDefault() Event Method to prevent it from submitting a form, since the Add button in HTML is of type submit.

The new div element added within the < ul class="todo-list"> </ul> must contain the following in the given order:
(a) A list element displaying the name of the task entered by the user in the input box. It should have a class todo-item
(b) A 'Complete button' with class complete-btn
(c) A 'Delete button' with class trash-btn

Note: Ensure the order of the above 3 elements are maintained.


2. Mark a task as completed: On clicking the completed button, the task name present inside the list element should get strike-through. e.g. make a coffee and on clicking the completed button again the strike-through should be removed. e.g. make a coffee
Note: Only use the CSS property text-decoration: line-through solid rgb(0, 0, 0); to implement this.

The completed button must have complete-btn as a class and should function as explained, otherwise your test cases will not pass.

3. Delete a task from the list: On clicking the Delete Button, the corresponding component that contains that Delete button should get deleted, and removed from the < ul class="todo-list"> </ul>

The Delete button must have trash-btn as a class and should function as explained above, otherwise your test cases will not pass.*/
function addTask(event){
    event.preventDefault()
    const todoListNode=document.getElementsByClassName('todo-input')[0]
    const task=todoListNode.value
    const createDiv=document.createElement('div')
    const createList=document.createElement('li')
    createList.setAttribute('class','todo-item')
    createList.innerText=task
    const createCompletButton=document.createElement('button')
    createCompletButton.setAttribute('class','complete-btn')
    createCompletButton.innerText='Complete'
    const createDeleteButton=document.createElement('button')
    createDeleteButton.setAttribute('class','trash-btn')
    createDeleteButton.innerText='Delete'
    createDiv.appendChild(createList)
    createDiv.appendChild(createCompletButton)
    createDiv.appendChild(createDeleteButton)
    const ulNode=document.getElementsByClassName('todo-list')[0]
    ulNode.appendChild(createDiv)
    addCompleteFunctionality(createCompletButton,createList)
    addDeleteFunctionality(createDeleteButton,createDiv)
}
const addButton=document.getElementsByClassName('todo-button')[0]
addButton.addEventListener('click',addTask)
function addCompleteFunctionality(createCompletButton,createList){
    createCompletButton.addEventListener('click',function(){
        if(createList.style['text-decoration']!==''){
            createList.style['text-decoration']=''
        }else{
            createList.style['text-decoration']='line-through solid rgb(0, 0, 0)'
        }
    })
}
function addDeleteFunctionality(createDeleteButton,createDiv){
    createDeleteButton.addEventListener('click',function(){
        createDiv.remove()
    })
}