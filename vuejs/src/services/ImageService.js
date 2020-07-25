import lotr01001 from '@/assets/cards/lotr01001.jpg'
import lotr01290 from '@/assets/cards/lotr01290.jpg'
import lotr01364 from '@/assets/cards/lotr01364.jpg'

const images = [];

class ImageService {
    
    constructor () {
        images["01001"] = lotr01001;
        images["01290"] = lotr01290;
        images["01364"] = lotr01364;
    }

    getImage(id) {
        return images[id];
    }
}

export default new ImageService() 
