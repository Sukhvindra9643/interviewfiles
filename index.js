

function findDuplicate(arr1,arr2){
    let duplicate = false;
    for(let i=0;i<arr1.length;i++){
        for(let j=0;j<arr2.length;j++){
            if(arr1[i] === arr2[j]){
                duplicate = true;
                break;
            }
        }
    }
    return duplicate;
}

const data = {
    name: 'John',
}

// const User = mongoose.model('User');
// const userDate = User.create(data);

// const getSomeq = await User.find({name:'Dibyansu'});

// select name from table_name where name = 'Dibyansu';

// select * from customer where name = "sukhvindra"

console.log(findDuplicate([1,2,3,4,5],[6,7,5,9,10]));