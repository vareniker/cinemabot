state: Start
        q!: $regexp</start>
        go!: ../CinemaAssistant

state: CinemaAssistant
    a: Как я могу помочь?

       
    
        
    
state: NoMatch
    event!: noMatch
    a: Извините, я вас не понял. Попробуйте переформулировать вопрос.
