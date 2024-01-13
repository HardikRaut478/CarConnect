var carDataTableBody = document.getElementById("car_data_table_body")

var carSearchBoxId = document.getElementById("car_search_box_id")

test()

async function test() {
    printAllCars()
    printCar(await getCarById(8))   
}

function changeInSearchBox() {
    console.log(carSearchBoxId.value)
}


async function getAllCars() {
    let listOfCarResponse = await fetch("http://localhost:7090")
    let listOfCar = await listOfCarResponse.json()
    console.log(listOfCar) 
    return listOfCar
}

async function getCarById(id) {
    var carResponse = await fetch("http://localhost:7090/"+id)
    var car = await carResponse.json()
    console.log(car)
    return car
}

async function printCar(car) {
    // var car = await getCarById(id)
    var trTag = document.createElement("tr")
    trTag.innerHTML = `<th scope="row">${car.id}</th>
    <td>${car.model}  </td>
    <td>${car.engine}  </td>
    <td>${car.doors}  </td>`
    carDataTableBody.appendChild(trTag)
}


async function printAllCars(){

    let listOfCar = await getAllCars()
    
    listOfCar.forEach(car => {

        printCar(car)

        // var trTag = document.createElement("tr")
        // trTag.innerHTML = `<th scope="row">${car.id}</th>
        // <td>${car.model}  </td>
        // <td>${car.engine}  </td>
        // <td>${car.doors}  </td>`
        // carDataTableBody.appendChild(trTag)
        
    });    
}