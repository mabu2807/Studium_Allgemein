def main():
    Text = ''
    print('Wie möchten sie den Text einlesen? d = datei / c = console / v = varibale')
    while Text == '':
        m = input()
        if m == 'v':
            Text = "Familie Müller plant ihren Urlaub Sie geht in ein Reisebüro und lässt sich von einem Angestellten beraten Als Reiseziel wählt sie Mallorca aus Familie Müller bucht einen Flug auf die Mittelmeerinsel Sie bucht außerdem zwei Zimmer in einem großen Hotel direkt am Strand Familie Müller badet gerne im Meer Am Abflugtag fahren Herr und Frau Müller mit ihren beiden Kindern im Taxi zum Flughafen Dort warten schon viele Urlauber Alle wollen nach Mallorca fliegen Familie Müller hat viel Gepäck dabei drei große Koffer und zwei Taschen Die Taschen sind Handgepäck Familie Müller nimmt sie mit in das Flugzeug Am Flugschalter checkt die Familie ein und erhält ihre Bordkarten Die Angestellte am Flugschalter erklärt Herrn Müller den Weg zum Flugsteig Es ist nicht mehr viel Zeit bis zum Abflug Familie Müller geht durch die Sicherheitskontrolle Als alle das richtige Gate erreichen setzen sie sich in den Wartebereich Kurz darauf wird ihre Flugnummer aufgerufen und Familie Müller steigt mit vielen anderen Passagieren in das Flugzeug nach Mallorca Beim Starten fühlt sich Herr Müller nicht wohl Ihm wird ein wenig übel Nach zwei Stunden landet das Flugzeug Am Gepäckband warten alle Passagiere noch auf ihr fehlendes Gepäck Danach kann endlich der Urlaub beginnen"
        elif m == 'c':
            print("Bitte Text eingeben:")
            Text = input()
        elif m == 'd':
            datei = open(r'C:\Users\I550440\Desktop\Locale Projekte\Krypto\text.txt','r', encoding="utf-8")
            Text = datei.read()
        if Text == '':
            print('Leider konnte noch kein Text gefunden werden. Bitte versuchen Sie es erneut!')

    alphabet= ['a','b','c', 'd', 'e', 'f', 'g','h','i','j','k','l','m', 'n', 'o', 'p', 'q','r','s','t', 'u', 'v', 'w', 'x','y','z','ß','ä', 'ö','ü']
    Koinzidenzindex = 0
    anzahlZeichen= 0
    array = []
    Text =Text.lower()
    print(Text)
    for i in alphabet:
        counter= 0
        counter = Text.count(i)
        anzahlZeichen += counter
        print(i , counter)
        if counter != 0:
            array.append(counter)
    
    for i in array:
        percent = i/anzahlZeichen
        sqrpercent = percent*percent
        Koinzidenzindex += sqrpercent
    print('')
    print('Die Koinzidenzindex ist:')
    print(Koinzidenzindex)

 
if __name__ == '__main__':
    main()