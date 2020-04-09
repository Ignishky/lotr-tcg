import lotr01001 from "@/assets/cards/lotr01001.jpg";

const images = [];

class ImageService {
    
    constructor () {
        images["01001"] = lotr01001;
    }

    getImage(id) {
        return images[id];
    }
}

export default new ImageService() 
