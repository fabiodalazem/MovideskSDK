package br.icondev.entity;


@SuppressWarnings("serial")
public class MoviTicket extends MoviEntity {

	private int id;	// Número do ticket (Somente leitura). 
	private int type; //	✓	Tipo do ticket. 1 = Interno 2 = Público.
	private String subject;//	350	 	Assunto do ticket.
	private String category;//	string;	128	 	Nome da categoria do ticket. Deve ser informada uma categoria existente e que esteja relacionada ao tipo e ao serviço (caso este esteja informado) do ticket.
	private String urgency;//	string;	128	 	Nome da urgência do ticket. Deve ser informada uma urgência existente e que esteja relacionada a categoria (caso esta esteja informada no ticket).
	private String status;//	string	128	✓	Nome do status do ticket. Para alterar esse campo deve ser também informada a justificativa. O status deve ser um existente e que esteja relacionado ao tipo do ticket.
	private String baseStatus;//	string	128	 	
	private String justification;//	string	128	 	Nome da justificativa do ticket. Deve ser informada uma justificativa existente que esteja relacionada ao status do ticket. O preenchimento desse campo é obrigatório quando o status do ticket o exigir. Para alterar esse campo deve ser também informado o status.
	private int origin;//	int	1	 	Canal de abertura do ticket (Somente leitura).
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBaseStatus() {
		return baseStatus;
	}
	public void setBaseStatus(String baseStatus) {
		this.baseStatus = baseStatus;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	
	
	
	
	/*
	createdDate	datetime UTC	7	* 	Data de abertura do ticket. A data informada deve estar no formato UTC*. *Caso não for informada, será preenchida com a data atual.
	originEmailAccount	string	128	 	Conta de e-mail na qual o ticket foi recebido (Somente leitura).
	owner	person	 	 	Dados do responsável pelo ticket. Para alterar esse campo deve ser informada também a equipe do responsável pelo ticket. ver documentação
	ownerTeam	string	128	 	Equipe do responsável pelo ticket. Para alterar esse campo deve ser informado também o responsável pelo ticket. Caso o responsável pelo ticket esteja informado, a equipe do responsável deve estar associada a ele.
	createdBy	person	 	 ✓	Dados do gerador do ticket. ver documentação
	serviceFull	array	1024	 	Lista com os nomes dos níveis do serviço selecionado no ticket (Somente leitura).
	serviceFirstLevelId	int	10	 	Id (Código) do serviço selecionado no ticket.
	serviceFirstLevel	string	1024	 	Nome do primeiro nível do serviço selecionado no ticket (Somente leitura).
	serviceSecondLevel	string	1024	 	Nome do segundo nível do serviço selecionado no ticket (Somente leitura).
	serviceThirdLevel	string	1024	 	Nome do terceiro nível do serviço selecionado no ticket (Somente leitura).
	contactForm	string	128	 	Nome do formulário de contato através do qual o ticket foi aberto (Somente leitura).
	tags	array	 	 	Lista de strings com as TAGs as quais o ticket esta relacionado. Caso sejam informadas TAGs inexistentes, as mesmas serão adicionadas na base de dados.
	cc	string	1024	 	Relação dos e-mails informados no campo Cc, separados por ponto-e-vírgula.
	resolvedIn	datetime UTC	 	 	Data na qual o ticket foi indicado pelo agente como resolvido. A data informada deve estar no formato UTC.
	reopenedIn	datetime UTC	 	 	Data na qual o ticket teve a ultima reabertura (Somente leitura).
	closedIn	datetime UTC	 	 	Data na qual o ticket foi indicado como fechado. A data informada deve estar no formato UTC.
	lastActionDate	datetime UTC	 	 	Data UTC da última ação do ticket (Somente leitura).
	actionCount	int	 	 	Quantidade de ações do ticket (Somente leitura).
	lastUpdate	datetime UTC	 	 	Data UTC da ultima alteração do ticket (Somente leitura).
	lifetimeWorkingTime	int	 	 	Tempo de vida do ticket em minutos em horas úteis desde a abertura (Somente leitura).
	stoppedTime	int	 	 	Tempo que o ticket ficou no status parado em minutos em horas corridas (Somente leitura).
	stoppedTimeWorkingTime	int	 	 	Tempo que o ticket ficou no status parado em minutos em horas úteis (Somente leitura).
	resolvedInFirstCall	bool	 	 	Indicador que representa se o ticket foi resolvido já no momento da abertura ou num momento posterior (Somente leitura).
	chatWidget	string	128	 	Aplicativo de chat através do qual o ticket foi aberto (Somente leitura).
	chatGroup	string	128	 	Grupo de chat através do qual o ticket foi aberto (Somente leitura).
	chatTalkTime	int	 	 	Tempo de duração do chat em minutos (Somente leitura).
	chatWaitingTime	int	 	 	Tempo que o cliente ficou aguardando para ser atendido em minutos (Somente leitura).
	sequence	int	 	 	Número inteiro armazenado no campo Sequência.
	slaAgreement	string	128	 	Contrato SLA utilizado no ticket (Somente leitura).
	slaAgreementRule	string	128	 	Regra do contrato SLA (Somente leitura).
	slaSolutionTime	int	 	 	Tempo de solução do contrato SLA (Somente leitura).
	slaResponseTime	int	 	 	Tempo de resposta do contrato SLA (Somente leitura).
	slaSolutionChangedByUser	bool	 	 	Indica se o contrato SLA foi manualmente alterado pelo usuário (Somente leitura).
	slaSolutionChangedBy	person	 	 	Dados da pessoa que alterou o contrato SLA (Somente leitura). ver documentação
	slaSolutionDate	datetime UTC	 	 	Data de solução do SLA. Caso informado, será considerado que o SLA foi manualmente alterado pelo usuário que criou a ação. A data informada deve estar no formato UTC.
	slaSolutionDateIsPaused	bool	 	 	Indica se a data de solução do SLA está pausada (Somente leitura).
	slaResponseDate	datetime UTC	 	 	Data UTC de resposta do SLA (Somente leitura).
	slaRealResponseDate	datetime UTC	 	 	Data UTC real da resposta do SLA (Somente leitura).
	jiraIssueKey	string	64	 	Chave da issue do Jira Software que está associada ao ticket por integração (Somente leitura).
	redmineIssueId	int	 	 	ID da issue do Redmine que está associada ao ticket por integração (Somente leitura).
	clients	array	 	  ✓  	Lista com os clientes do ticket. ver documentação
	actions	array	 	✓	Lista com as ações do ticket. ver documentação
	parentTickets	array	 	 	Lista com os tickets pais. ver documentação
	childrenTickets	array	 	 	Lista com os tickets filhos. ver documentação
	ownerHistories	array	 	 	Lista com os históricos de responsabilidades do ticket (Somente leitura). ver documentação
	statusHistories	array	 	 	Lista com os históricos de status do ticket (Somente leitura). ver documentação
	satisfactionSurveyResponses	array	 	 	Lista com respostas de satisfação do ticket (Somente leitura). ver documentação
	customFieldValues	array	 	 	Lista com os valores dos campos adicionais do ticket. ver documentação
	assets	array	 	 	Lista com os ativos do ticket. ver documentação
	Tickets » Clientes
	ticket.client[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	string	64	✓	Id (Cod. ref.) da empresa, departamento ou pessoa relacionado como cliente do ticket (Somente leitura).
	businessName	string	128	 	Nome do cliente (Somente leitura).
	email	string	128	 	E-mail principal do cliente (Somente leitura).
	phone	string	128	 	Telefone principal do cliente (Somente leitura).
	personType	int	1	✓ 	Pessoa = 1, Empresa = 2, Departamento = 4  (Somente leitura).
	profileType	int	1	✓ 	Agente = 1, Cliente = 2, Agente e Cliente = 3  (Somente leitura).
	isDeleted	bool	 	 	Verdadeiro se o cliente foi deletado (Somente leitura).
	organization	person	 	 	Organização do cliente (Somente leitura). ver documentação
	Tickets » Ações
	ticket.actions[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	int	 10	* 	Id (Número da ação) (Somente leitura). *Deve ser informado quando necessário alterar a ação já existente.
	type	int	1	✓	Tipo do ticket: 1 = Interno 2 = Público. 
	origin	int	1	 	Origem da ação (Somente leitura).
	1	Via web pelo cliente
	2	Via web pelo agente
	3	Recebido via email
	4	Gatilho do sistema
	5	Chat (online)
	7	Email enviado pelo sistema
	8	Formulário de contato
	9	Via web API
	description	string	 max	✓	Descrição da ação.
	htmlDescription	string	max	 	Descrição da ação em formato HTML (Somente leitura).
	status	string	128	 	Status da ação (Somente leitura).
	justification	string	128	 	Justificativa da ação (Somente leitura).
	createdDate	datetime UTC	 	* 	Data de criação da ação. A data informada deve estar no formato UTC. *Caso não informada, será preenchida com a data atual.
	createdBy	person	 	 	Dados do gerador da ação. ver documentação
	isDeleted	bool	 	 	Verdadeiro se a ação foi deletada (Somente leitura).
	timeAppointments	array	 	 	Dados dos apontamentos de hora. ver documentação
	attachments	array	 	 	Dados dos anexos (Somente leitura). ver documentação
	tags	array	 	 	Lista de strings com as TAGs as quais a ação esta relacionada. Caso sejam informadas TAGs inexistentes, as mesmas serão adicionadas na base de dados.
	Tickets » Ações » Apontamentos de horas
	ticket.actions.timeAppointments[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	int	 	 *	Id (Código) do apontamento (Somente leitura). *Deve ser informado quando necessário alterar o apontamento já existente.
	activity	string	128	✓	Deve ser uma atividade cadastrada previamente no sistema.
	date	datetime	 	✓	Deve conter a data com as horas zeradas Ex: 2016-08-24T00:00:00.
	periodStart	time	 	*	Período inicial do apontamento. Ex: 08:00:00. *Obrigatório quando determinado via parametrização.
	periodEnd	time	 	*	Período final do apontamento. Ex: 12:00:00. *Obrigatório quando determinado via parametrização.
	workTime	time	 	 *	Tempo total do apontamento. Ex: 04:00:00. *Obrigatório quando determinado via parametrização.
	workType	int	 	✓	Tipo do horário apontado: 1 = Hora normal, 2 = Hora extra.
	createdBy	person	 	 ✓	Dados do gerador do apontamento. ver documentação
	createdByTeam	Team	 	*	Dados do time do gerador do apontamento.
	Tickets » Ações » Anexos
	ticket.actions.attachments[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	fileName	string	255	✓	Nome do arquivo enviado (Somente leitura).
	path	string	255	✓	Hash do arquivo enviado (Somente leitura).
	createdBy	person	 	 	Dados do pessoa que enviou o arquivo (Somente leitura). ver documentação
	createdDate	datetime UTC	 	 	Data UTC que o arquivo foi enviado (Somente leitura).
	Tickets » Tickets Pais/Filhos
	ticket.parentTickets[n]
	ticket.childrenTickets[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	int	 	✓ 	Id (Número) do ticket.
	subject	string	128	 	Assunto do ticket (Somente leitura).
	isDeleted	bool	 	 	Verdadeiro se foi deletado (Somente leitura).
	Tickets » Históricos de responsabilidades
	ticket.ownerHistories[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	ownerTeam	string	 128	  	Equipe do responsável pelo ticket (Somente leitura).
	owner	person	 	 	Dados do responsável pelo ticket (Somente leitura). ver documentação
	permanencyTimeFullTime	double	 	 	Tempo de permanência do responsável pelo ticket em segundos. (Somente leitura).
	permanencyTimeWorkingTime	double	 	 	Tempo útil de permanência do responsável pelo ticket em segundos. (Somente leitura).
	changedBy	person	 	 	Dados da pessoa que alterou o responsável pelo ticket (Somente leitura). ver documentação
	changedDate	datetime UTC	 	 	Data UTC que o responsável pelo ticket foi alterado (Somente leitura).
	Tickets » Históricos de status
	ticket.statusHistories[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	status	string	 128	  	Status do ticket (Somente leitura).
	justification	string	 128	 	Justificativa do ticket (Somente leitura). 
	permanencyTimeFullTime	double	 	 	Tempo de permanência do status do ticket em segundos. (Somente leitura).
	permanencyTimeWorkingTime	double	 	 	Tempo útil de permanência do status do ticket em segundos. (Somente leitura).
	changedBy	person	 	 	Dados da pessoa que alterou o status do ticket (Somente leitura). ver documentação
	changedDate	datetime UTC	 	 	Data UTC que o status do ticket foi alterado (Somente leitura).
	Tickets » Respostas de satisfação
	ticket.satisfactionSurveyResponses[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	int	 10	  	Id (Código) da resposta de satisfação (Somente leitura).
	responsedBy	person	 	 	Dados da pessoa que respondeu (Somente leitura). ver documentação
	responseDate	datetime UTC	 	 	Data UTC da resposta (Somente leitura).
	satisfactionSurveyModel	int	 10	 	Modelo de pontuação da resposta: 1 = Positivo/Negativo, 2 = Faces sorridentes, 3 = NPS (Somente leitura).
	satisfactionSurveyNetPromoterScoreResponse	int	 10 	 	Pontuação de 0 a 10 (NPS). *Obrigatório dependendo da escolha do satisfactionSurveyModel (Somente leitura).
	satisfactionSurveyPositiveNegativeResponse	int	 10 	 	Pontuação: 1 = Positivo e 2 = Negativo. *Obrigatório dependendo da escolha do satisfactionSurveyModel (Somente leitura).
	satisfactionSurveySmileyFacesResponse	int	 10 	 	Pontuação faces sorridentes: 1 = Muito insatisfeito, 2 = Insatisfeito, 3 = Neutro, 4 = Satisfeito, 5 = Muito satisfeito. *Obrigatório dependendo da escolha do satisfactionSurveyModel (Somente leitura).
	comments	string	max	 	Comentários da reposta (Somente leitura).
	Tickets » Campos adicionais
	ticket.customFieldValues[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	customFieldId	int	64	✓	Id do campo adicional (pode ser obtido na listagem de campos adicionais no website).
	customFieldRuleId	int	64	✓	Id da regra de exibição dos campos adicionais (pode ser obtido na listagem de regras para exibição no website).
	line	int	64	✓	Número da linha da regra de exibição na tela do ticket. Quando a regra não permitir a adição de novas linhas deve ser informado o valor 1 e não devem ser repetidos valores de campos adicionais para o id da regra em conjunto com o id do campo. Para alterar o valor de um campo deve ser informada a linha em que ele se encontra. Os campos que estiverem na base de dados e não forem enviados no corpo da requisição serão excluídos.
	value	string	max	 *	Valor texto do campo adicional. *Obrigatório quando o tipo do campo for: texto de uma linha, texto com várias linhas, texto HTML, expressão regular, numérico, data, hora, data e hora, e-mail, telefone ou URL. Os campos de data devem estar em horário *UTC e no formato YYYY-MM-DDThh:MM:ss.000Z e o campo hora deve ser informado juntamente com a data fixa "1991-01-01". O campo numérico deve estar no formato brasileiro, por exemplo "1.530,75".
	items	array	 	* 	Lista de itens. *Obrigatório quando o tipo do campo for: lista de valores, lista de pessoas, lista de clientes, lista de agentes, seleção múltipla ou seleção única. Deve ser informado apenas um item se o campo adicional não permitir seleção múltipla. ver documentação
	Tickets » Campos adicionais » Itens
	ticket.customFieldValues.items[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	personId	int	64	*	Id (Cod. ref.) da empresa, departamento ou pessoa. *Obrigatório quando o tipo do campo for lista de pessoas.
	clientId	int	64	*	Id (Cod. ref.) da empresa, departamento ou pessoa. *Obrigatório quando o tipo do campo for lista de clientes.
	team	string	128	*	Nome da equipe. *Obrigatório quando o tipo do campo lista de agentes (o personId pode ser informado para especificar o agente da equipe).
	customFieldItem	string	256	*	Nome do item do campo adicional. *Obrigatório quando o tipo do campo for: lista de valores, seleção múltipla ou seleção única.
	Tickets » Ativos
	ticket.assets[n]

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	string	64	✓ 	Id (Cod. ref.) do ativo (Somente leitura).
	name	string	 128	✓ 	Nome do ativo (Somente leitura).
	label	string	128	 	Etiqueta (única) do ativo (Somente leitura).
	serialNumber	string	128	 	Número de série do ativo (Somente leitura).
	categoryFull	array	 	 	Lista com os nomes dos níveis da categoria selecionada no ativo (Somente leitura).
	categoryFirstLevel	string	128	 	Nome do primeiro nível da categoria selecionada no ativo (Somente leitura).
	categorySecondLevel	string	128	 	Nome do segundo nível da categoria selecionada no ativo (Somente leitura).
	categoryThirdLevel	string	128	 	Nome do terceiro nível da categoria selecionada no ativo (Somente leitura).
	isDeleted	bool  	 	 	Verdadeiro se o ativo foi deletado do ticket (Somente leitura).
	Person
	ticket.clients[n].organization
	ticket.actions[n].createdBy
	ticket.actions[n].timeAppointments[n].createdBy
	ticket.owner
	ticket.createdBy
	ticket.slaSolutionChangedBy

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	string	64	 ✓ 	Id (Cod. ref.) da organização (Somente leitura).
	businessName	string	128	 	Nome da organização (Somente leitura).
	email	string	128	 	E-mail principal da organização (Somente leitura).
	phone	string	128	 	Telefone principal da organização (Somente leitura).
	personType	int	1	 	Tipo da pessoa: Pessoa = 1, Empresa = 2, Departamento = 4  (Somente leitura).
	profileType	int	1	 	
	Perfil da pessoa: Agente = 1, Cliente = 2, Agente e Cliente = 3  (Somente leitura).

	Team
	ticket.actions[n].timeAppointments[n].createdByTeam

	Parâmetro	Tipo	Tamanho	Obrigatório	Descrição
	id	int	 	 ✓ 	Id (Cod. ref.) do time (Somente leitura).
	name	string	128	 	Nome do time (Somente leitura).

	*UTC:
	**/	
}
