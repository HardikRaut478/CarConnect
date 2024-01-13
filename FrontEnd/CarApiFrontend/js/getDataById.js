async function getCarById(id) {
    var carResponse = await fetch("http://localhost:7090/"+id)
    var car = await carResponse.json()
    console.log(car)
    return car
}