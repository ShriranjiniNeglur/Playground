var map;
function initMap() {
    map = new google.maps.Map(document.getElementById('map'), {
        center: { lat: 15.3498, lng: 75.1578 },
        zoom: 16
    });
    var icon = {
        url: "icons/icon-hotel-10.png",
        scaledSize: new google.maps.Size(60, 60),
        origin: new google.maps.Point(0, 0),
        anchor: new google.maps.Point(0, 0)
    };
    var marker = new google.maps.Marker({
        position: { lat: 15.3498, lng: 75.1578 },
        map: map,
        icon: icon,
        circle: circle,
        Draggable: true
    });
    var infowindow = new google.maps.InfoWindow({
        content: '<div><h1>SAMS PODs</h1><div><img src="icons/soundproof-sleeping-pod.png" height=250px width=490px></img><p>Hubli Airport Terminal 1 Floor 1 to 5</p><p>Book Your SAMS POD here<a href="SAMS PODS Booking">Book here</a></p></div></div>',
    });
    marker.addListener('click', function () {
        infowindow.open(map, marker);
    });

    var circle = new google.maps.Circle({
        center: { lat: 15.3498, lng: 75.1578 },
        map: map,
        radius: 500,
        fillColor: '#FF6600',
        fillOpacity: 0.3,
        strokeColor: "#FFF",
        strokeWeight: 0,
        Draggable:true
    });
    marker.setMap(map);
    marker.setMap(map);

   



}


