package timeCounter

import java.time.Period
import java.time.LocalDate
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.annotations.Observable

@Accessors
@Observable
class TimeCounter {
	var now: LocalDate? = LocalDate.now()
	var anotherDate: LocalDate? = now
	var days: Int? = calc()
	
	fun calc() = Period.between(anotherDate, now).days
}
