function areaCirculo(){
    let radio = document.getElementById("radioCirculo").value;
    let area = radio*radio*Math.PI;
    alert("Area: "+ area);  
    return area;
}
function areaEsfera(){
    let radio = document.getElementById("radioEsfera").value;
    let area = radio*radio*Math.PI*4;
    alert("Area: "+ area);  
    return area;
}
function areaCuadrado(){
    let lado = document.getElementById("ladoCuadrado").value;
    let area = lado*lado;
    alert("Area: " + area);  
}
function areaCubo(){
    let lado = document.getElementById("ladoCubo").value;
    let area = lado*lado*6;
    alert("Area: "+area);  
    return area;
}
function areaTriangulo(){
    let base   = document.getElementById("baseTriangulo").value;
    let altura = document.getElementById("alturaTriangulo").value;
    let area = (base*altura)/2;
    alert("Area: " + area);  
    return area;
}
