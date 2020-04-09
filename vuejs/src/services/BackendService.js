import axios from 'axios'

class Backend {
    async getCard(id) {
        return await axios.get('/api/cards/' + id)
    }
}

export default new Backend()
