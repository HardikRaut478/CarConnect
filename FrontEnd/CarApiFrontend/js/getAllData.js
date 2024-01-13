async function getAllCars() {
    let listOfCarResponse = await fetch("http://localhost:7090")
    let listOfCar = await listOfCarResponse.json()
    console.log(listOfCar) 
    return listOfCar
}