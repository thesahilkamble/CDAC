const names = ['Sahil', 'Sachin', 'Vaibhav', 'Sohan', 'Saurabh']
        
for(let name of names){
    document.getElementById('list').innerHTML += `<li>${name}</li>`
}
