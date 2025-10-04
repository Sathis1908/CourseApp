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

function showCourse()
{
    fetch("http://localhost:8080/course/list")
    .then((response) => response.json())
    .then((courses) =>
    {
        const datatable = document.getElementById("courselist");
        courses.forEach(course => {
            const rowlist = course;
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.durationInWeeks}</td>
            <td>${course.trainerName}</td>
            <td><button style="background-color: rgb(12, 193, 12)"  onclick="editrow(${course.courseId},'${course.courseName}',${course.durationInWeeks},'${course.trainerName}')">Edit</button></td>   
            <td><button style="background-color: rgba(243, 45, 45, 1)" onclick= deleterow(${course.courseId})>Delete</button></td>`
            datatable.innerHTML += row;

        });
    });
}

function editrow(courseId,courseName,durationInWeeks,trainerName)
{
    window.location.href = "../html/updatecourse.html";
    localStorage.setItem("editCourse", JSON.stringify({
    courseId,
    courseName,
    durationInWeeks,
    trainerName
  }));
}



function deleterow(id)
{
    if (!confirm("Are you sure you want to delete this item?")) return;

    fetch(`http://localhost:8080/course/delete/${id}`,{method : 'DELETE'})
    .then((response) => {
        if(response.ok)
        {
            alert("Delete successfully")
            location.reload();
        }
        else{
            alert("Delete failed!")
        }
    });
}


