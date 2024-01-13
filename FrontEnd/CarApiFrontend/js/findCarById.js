var carSearchBoxId = document.getElementById("car_search_box_id")
var testDivTemplate = document.getElementById("testDiv")

function changeInSearchBox() {
    console.log(carSearchBoxId.value)
    var carDataTableBody = document.getElementById("car_data_table_body");
    getCarById(carSearchBoxId.value)
        .then(function(car) {
            printCarInTemplate(car, testDivTemplate);
        })
        .catch(function(error) {
            console.error("Error loading car:", error);
        });
}