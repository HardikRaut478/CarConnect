function loadPage() {
    var carTemplateContainer = document.getElementById("car_template_container");

    getAllCars()
        .then(function(listOfCar) {
            printListOfCarInTemplate(listOfCar, carTemplateContainer);
        })
        .catch(function(error) {
            console.error("Error loading car:", error);
        });
}