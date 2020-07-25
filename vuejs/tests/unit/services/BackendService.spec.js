import axios from 'axios'
import backendService from '@/services/BackendService'

jest.mock('axios')

describe('BackendService', () => {

    test('Should call API to return card from id', async () => {
        const card = {
            data: {
                name: 'cardName',
                number: 'cardNumber'
            }
        };
        
        axios.get.mockResolvedValue(card);

        await expect(backendService.getCard("toto")).resolves.toEqual(card)
        expect(axios.get).toHaveBeenCalledWith("/api/cards/toto");
    })
})
