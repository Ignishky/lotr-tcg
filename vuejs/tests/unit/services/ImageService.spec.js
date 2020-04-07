import lotr01001 from "@/assets/cards/lotr01001.jpg";
import ImageService from '@/services/ImageService'

describe('ImageService.js', () => {

    it('Should return null from unknown id', () =>{
        const image = ImageService.getImage("fakeId")

        expect(image).toBeUndefined()
    })

    it('Should return image from valid id', () => {
        const image = ImageService.getImage("01001")

        expect(image).toBe(lotr01001)
    })
})
