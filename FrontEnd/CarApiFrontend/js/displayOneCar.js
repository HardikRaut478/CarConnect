function loadPage(id) {
    var carTemplateContainer = document.getElementById("car_template_container");

    getCarById(id)
        .then(function(listOfCar) {
            printCarInTemplateReplace(listOfCar, carTemplateContainer);
        })
        .catch(function(error) {
            console.error("Error loading car:", error);
        });
}