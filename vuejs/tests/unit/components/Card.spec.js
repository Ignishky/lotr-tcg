import { shallowMount } from '@vue/test-utils'
import Card from '@/components/Card'

jest.mock("@/services/BackendService");
jest.mock("@/services/ImageService");

describe('Card.vue', () => {

  it('Should find image for valid props id', () => {
    const cardId = 'valid'
    const wrapper = shallowMount(Card, {
      propsData: { id: cardId }
    })

    expect(wrapper.props().id).toBe(cardId)
    wrapper.vm.$nextTick(() => {
      expect(wrapper.vm.cardNumber).toBe("01364")
      expect(wrapper.vm.image).toBe("assets/lotr01001.jpg")
    })
  })

  it('Should return null with invalid props id', () => {
    const cardId = 'invalid'
    const wrapper = shallowMount(Card, {
      propsData: { id: cardId }
    })

    expect(wrapper.props().id).toBe(cardId)
    wrapper.vm.$nextTick(() => {
      expect(wrapper.vm.cardNumber).toBe(null)
      expect(wrapper.vm.image).toBe(null)
    })
  })
})
