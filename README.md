# Projeto da disciplina de Tolerância a Falhas de Software
- Disciplina ministrada pelo Professor Dr: Patrick Henrique Brito
- Período: 2º semestre de 2022

## Eram objetivos:

Utilizar a técnica de `N-Version Programming` para implementar a redundância das três versões do componente limite. 

Logica da redundância: se a diferença entre ao menos `DOIS` dos  retornos dos componentes redundantes for de até `5%`, o resultado é confiável e deve ser retornada a média dos valores `dentro dessa margem de similaridade`. Caso um dos valores fique fora dessa margem, deverá ser descartado. Caso os três componentes divirjam acima do limiar desejado, deve ser lançada uma exceção do tipo `“RuntimeException”`.

- Criar o componente `principal`;
- Criar o componente `Conector` e implementar a logica;

OBS: O `labCOSMOS-emprestimo`, `labCOSMOS-limite`, `labCOSMOS-limite2` e `labCOSMOS-limite3` foram disponibilizados durante as aulas pelo professor.
