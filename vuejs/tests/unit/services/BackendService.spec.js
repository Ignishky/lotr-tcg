import axios from 'axios';
import BackendService from '@/services/BackendService'

jest.mock('axios');

describe('BackendService.js', () => {

    it('Should return card from valid id', async () => {
        const data = {
            data: {
                name: 'cardName',
                number: 'cardNumber'
            }
        };
        
        axios.get.mockImplementationOnce(() => Promise.resolve(data));

        await expect(BackendService.getCard("toto")).resolves.toEqual(data)
        expect(axios.get).toHaveBeenCalledWith("/api/cards/toto");
    })
})
