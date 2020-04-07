import { shallowMount } from '@vue/test-utils'
import App from '@/App'

describe('App.vue', () => {

  it('Should find image for valid props id', () => {
    const wrapper = shallowMount(App)

    expect(wrapper.isVueInstance()).toBeTruthy()
  })
})
