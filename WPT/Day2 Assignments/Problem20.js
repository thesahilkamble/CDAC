const names = ['Sahil', 'Sachin', 'Vaibhav', 'Sohan', 'Saurabh']
let str = ''
for(let name of names){
    str += name.toLocaleUpperCase()+','
}
str = str.slice(0, str.length - 1)
document.getElementById('out').innerHTML = `<h3>Members of my group are</h3> ${str} `