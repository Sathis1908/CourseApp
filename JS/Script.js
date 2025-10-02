function enrolled() {
    window.location.href = "./html/enrolled.html";
}

function courselist() {
    window.location.href = "./html/courseList.html";
}

function studentlist() {
    window.location.href = "./html/studentList.html";
}


function showStudent()
{

    fetch("http://localhost:8080/course/enrolledlist")
    .then((response) => response.json())
    .then((students) => {
        const dataTable = document.getElementById("studentlist");

        students.forEach(student => {
            var row =`<tr>
            <td>${student.name}</td>
            <td>${student.mailId}</td>
            <td>${student.phone}</td>
            <td>${student.courseName}</td></tr>
            `     
            dataTable.innerHTML +=row;       
        });

    });
}
