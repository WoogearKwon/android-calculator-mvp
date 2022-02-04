package edu.nextstep.camp.calculator

import edu.nextstep.camp.calculator.domain.Expression
import edu.nextstep.camp.calculator.domain.Memory
import edu.nextstep.camp.calculator.domain.Operator

interface MainContract {
    interface View {
        fun onViewUpdated(newExpression: Expression)

        fun onExpressionIncomplete()

        fun onViewTypeChanged(viewType: CalculatorViewType, memory: Memory)
    }

    interface Presenter {
        fun addNumber(expression: Expression, number: String)

        fun addOperator(expression: Expression, operator: Operator)

        fun delete(expression: Expression)

        fun calculate(expression: Expression)

        fun toggleViewType()
    }
}