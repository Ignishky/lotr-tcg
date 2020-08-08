import { shallowMount } from '@vue/test-utils'
import Card from '@/components/Card'
import Backend from '@/services/BackendService'
import ImageService from '@/services/ImageService'
import lotr01364 from '@/assets/cards/lotr01364.jpg'

jest.mock('@/services/BackendService')
jest.mock('@/services/ImageService')

describe('Card', () => {

  test('Should find image for valid props id', async () => {
    const card = {
      data: {
        name: 'cardName',
        number: '01364'
      }
    }

    Backend.getCard.mockResolvedValue(card)
    ImageService.getImage.mockReturnValue(lotr01364)

    const wrapper = shallowMount(Card, {
      propsData: { id: 'valid' }
    })

    await wrapper.vm.$nextTick()
    expect(wrapper.vm.number).toBe("01364")
    expect(ImageService.getImage).toHaveBeenNthCalledWith(1, 'valid')
    expect(wrapper.vm.image).toBe(lotr01364)
    expect(wrapper.vm.name).toBe("cardName")
  })

  test('Should return null with invalid props id', async () => {
    Backend.getCard.mockRejectedValue()
    ImageService.getImage.mockClear()

    const wrapper = shallowMount(Card, {
      propsData: { id: 'invalid' }
    })

    await wrapper.vm.$nextTick()
    expect(wrapper.vm.image).toBe(null)
    expect(ImageService.getImage).not.toHaveBeenCalled()
    expect(wrapper.vm.image).toBe(null)
    expect(wrapper.vm.name).toBe(null)
  })
})
