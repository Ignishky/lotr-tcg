import lotr01001 from '@/assets/cards/lotr01001.jpg'
import ImageService from '@/services/ImageService'

describe('ImageService', () => {

    test('Should return undefined from unknown id', () =>{
        const image = ImageService.getImage("fakeId")

        expect(image).toBeUndefined()
    })

    test('Should return image from valid id', () => {
        const image = ImageService.getImage("01001")

        expect(image).toBe(lotr01001)
    })
})
