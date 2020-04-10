export default {
    getCard: (id) => {
        if(id === "valid") {
            return Promise.resolve({ data: {number: '01364', name:'Gandalf'} })
        } else {
            return Promise.reject()
        }
    }
} 