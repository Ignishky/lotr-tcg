export default {
    getCard: (id) => {
        if(id === "valid") {
            return Promise.resolve({ data: {cardNumber: '01364', name:'Gandalf'} })
        } else {
            return Promise.reject()
        }
    }
} 