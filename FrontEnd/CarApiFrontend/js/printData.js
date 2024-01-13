
function printListOfCarInTemplate(listOfCar, carTemplateContainer) {
    listOfCar.forEach(car => {
        printCarInTemplate(car, carTemplateContainer)
    });
}

function printCarInTemplate(car, template) {
    console.log(car)
    var carCardTemplate = document.createElement("div")
    carCardTemplate.classList.add("col-12")
    carCardTemplate.classList.add("my-2")
    carCardTemplate.classList.add("p-5")
    carCardTemplate.classList.add("text-center")

    carCardTemplate.innerHTML = `
    <div class="row g-0 bg-light position-relative">
        <div class="col-md-4 mb-md-0 p-md-4 d-flex flex-column align-items-center p-3">
            <h1 class="text-dark display-5">${car.model}</h1>
          
            <h2 class="lead">${car.body_type}</h2>
            <!-- <img src="../resources/carHome.jpg" class="card-img" alt="Car Home"> -->
        </div>
        <div class="col-md-4 pt-2 mt-2 ps-md-0 text-align: left">
            <h5>Engine: ${car.engine}</h5>
            <h5>Seats: ${car.seats}</h5>
            <h5>Doors: ${car.doors}</h5>
            <h5>Fuel type: ${car.fuel_type}</h5>
            <h5>maximum speed: ${car.maximum_speed}</h5>

            <h5>length: ${car.length}</h5>
            <h5>width: ${car.width}</h5>
            <h5>height: ${car.height}</h5>
            <h5>kerb_weight: ${car.kerb_weight}</h5>
            <h5>engine_layout: ${car.engine_layout}</h5>
            <h5>power: ${car.power}</h5>  
            <h5>wheelbase: ${car.wheelbase}</h5>

            <!-- <a href="../html/home.html" class="stretched-link"></a> -->
        </div>
        <div class="col-md-4 mt-2 pt-2">
        <p>start of production: ${car.start_of_production}</p>
            <p>powertrain architecture:${car.powertrain_architecture}</p>
            <p>acceleration 0-100 km/h:${car.acceleration0100kmh}</p>
            <p>acceleration 0-60mph:${car.acceleration060mph}</p>
            <p>acceleration 0-200 km/h:${car.acceleration0200kmh}</p>

           
            <p>number_of_cylinders: ${car.number_of_cylinders}</p>
            <p>engine_configuration: ${car.engine_configuration}</p>

            <p>number of gears and type of gearbox: ${car.number_of_gears_and_type_of_gearbox}</p>
            <p>fuel tank capacity: ${car.fuel_tank_capacity}</p>
            <p>drive wheel: ${car.drive_wheel}</p>
        </div>
    </div>`
    template.appendChild(carCardTemplate)
}

function printCarInTemplateReplace(car, template) {
    console.log(car)
    var carCardTemplate = document.createElement("div")
    carCardTemplate.classList.add("col-12")
    carCardTemplate.classList.add("my-2")
    carCardTemplate.classList.add("p-5")
    carCardTemplate.classList.add("text-center")

    carCardTemplate.innerHTML = `
    <div class="row g-0 bg-light position-relative">
        <div class="col-md-4 mb-md-0 p-md-4 d-flex flex-column align-items-center p-3">
            <h1 class="text-dark display-5">${car.model}</h1>
            <h4 class="lead">${car.generation}</h4>
            <h4 class="lead">${car.body_type}</h4>
            <!-- <img src="../resources/carHome.jpg" class="card-img" alt="Car Home"> -->
        </div>
        <div class="col-md-4 pt-2 mt-2 ps-md-0">
            <h5>Engine: ${car.engine}</h5>
            <h5>Seats: ${car.seats}</h5>
            <h5>Doors: ${car.doors}</h5>
            <h5>Fuel type: ${car.fuel_type}</h5>
            <!-- <a href="../html/home.html" class="stretched-link"></a> -->
        </div>
        <div class="col-md-4 mt-2 pt-2">
            <p>start of production: ${car.start_of_production}</p>
            <p>Tule je vatte te: ${car.engine}</p>
            <p>Tule je vatte te: ${car.engine}</p>
            <p>Tule je vatte te: ${car.engine}</p>
        </div>
    </div>`
    template.innerHTML= carCardTemplate.innerHTML
}
// 	private String power; 
// 	private String engine_layout;
// 	private int ;
// 	private String ;
// 	private int ;
// 	private int ;
// 	private int ;
// 	private int ;
// 	private int ;
// 	private String ;
// 	private String ;
// 	private int ;
// 	private int ;