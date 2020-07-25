// https://docs.cypress.io/api/introduction/api.html

describe('Should display images', () => {
  it('Visits the app root url', () => {
    cy.visit('/')
    cy.get('[alt="01001"]').should('have.attr', 'src', '/img/lotr01001.0d65364e.jpg')
    cy.get('[alt="01290"]').should('have.attr', 'src', '/img/lotr01290.657eaf55.jpg')
    cy.get('[alt="01364"]').should('have.attr', 'src', '/img/lotr01364.039cdda1.jpg')
  })
})
