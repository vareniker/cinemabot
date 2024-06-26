 theme: /
    state: Start
            q!: $regexp</start>
            go!: ../CinemaAssistant
    
    state: CinemaAssistant
        a: Как я могу помочь?
    
        state: CinemaSchedule
            q: *{[*скажи] [как*] [на] [сегодня] (расписание|сеанс*|афиш*|кино*|*фильмы) [есть|идут|идет|будут|будет] [идти]}*
            q: *{[*скажи] (что) [сегодня] (можно) (посмотреть) (в|из) (кино*)}*
            a: В следующем сообщении я выслал расписание фильмов на сегодня.
            
            state: ThankYou
                q: * ([большое] спасибо) | спс | благодарю *
                a: Обращайтесь!
        
    state: NoMatch
        event!: noMatch
        a: Извините, я вас не понял. Попробуйте переформулировать вопрос.
