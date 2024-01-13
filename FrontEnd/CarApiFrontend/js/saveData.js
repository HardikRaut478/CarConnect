// saveData.js

function postData() {
    var formData = {
        model: document.getElementById('model').value,
        generation: document.getElementById('generation').value,
        engine: document.getElementById('engine').value,
        start_of_production: parseInt(document.getElementById('start_of_production').value),
        powertrain_architecture: document.getElementById('powertrain_architecture').value,
        body_type: "Targa",
        seats: 2,
        doors: 2,
        fuel_type: "Petrol (Gasoline)",
        acceleration0100kmh: 2.7,
        acceleration060mph: 2.6,
        acceleration0200kmh: 7.3,
        power: "1001 Hp @ 6000 rpm. ",
        engine_layout: "Middle Longitudinal ",
        number_of_cylinders: 16,
        engine_configuration: "W-engine",
        kerb_weight: 1838,
        length: 4642,
        width: 1988,
        height: 1072,
        wheelbase: 2710,
        drive_wheel: "All wheel drive (4x4)",
        number_of_gears_and_type_of_gearbox: "7 gears automatic transmission DSG",
        maximum_speed: 407,
        fuel_tank_capacity: 100
        // Add more fields as needed
    };

    console.log(formData)
    fetch('http://localhost:7090/save', {
        method: 'POST',
        headers: {
            "Content-Type": "application/json"
            // Add any other headers if required
        },
        mode: 'no-cors',
        body: JSON.parse
    })
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
        // Handle success, e.g., display a success message
    })
    .catch(error => {
        console.error('Erjror:', error);
        // Handle error, e.g., display an error message
    });
}
