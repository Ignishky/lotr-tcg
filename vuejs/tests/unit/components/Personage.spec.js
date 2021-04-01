import { shallowMount } from '@vue/test-utils'
import Personage from '@/components/Personage'

jest.mock('@/components/Card')

describe('Personage', () => {

    test('Should find image for valid props id', () => {
        const wrapper = shallowMount(Personage, {
            propsData: { personageId: 'persoId', equipmentId: 'equipId' }
        })

        expect(wrapper.vm.personageId).toBe("persoId")
        expect(wrapper.vm.equipmentId).toBe("equipId")
        expect(wrapper.vm.hasEquipment).toBe(true)
    })

    test('Should return false when personage have no equipment', () => {
        const wrapper = shallowMount(Personage, {
            propsData: { personageId: 'persoId'}
        })

        expect(wrapper.vm.hasEquipment).toBe(false)
    })
})
