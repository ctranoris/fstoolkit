package gr.upatras.ece.wcl.radl2.serializer;

import com.google.inject.Inject;
import gr.upatras.ece.wcl.radl2.services.RadlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractRadlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RadlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ResourceAdapter___AllowedTypesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_ResourceAdapter___BindingParametersKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_ResourceAdapter___ConfigurationParametersKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_ResourceAdapter___SupportedChildTypesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_rulSSH_commands___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q;
	protected AbstractElementAlias match_ruleHTTP_URL___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q;
	protected AbstractElementAlias match_ruleXMLRPC___ParametersKeyword_12_0_EqualsSignKeyword_12_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RadlGrammarAccess) access;
		match_ResourceAdapter___AllowedTypesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getAllowedTypesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_6_3()));
		match_ResourceAdapter___BindingParametersKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getBindingParametersKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_4_3()));
		match_ResourceAdapter___ConfigurationParametersKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getConfigurationParametersKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_3_3()));
		match_ResourceAdapter___SupportedChildTypesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getSupportedChildTypesKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_5_3()));
		match_rulSSH_commands___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getRulSSH_commandsAccess().getLessThanSignLessThanSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRulSSH_commandsAccess().getGreaterThanSignGreaterThanSignKeyword_2_2()));
		match_ruleHTTP_URL___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getRuleHTTP_URLAccess().getLessThanSignLessThanSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRuleHTTP_URLAccess().getGreaterThanSignGreaterThanSignKeyword_2_2()));
		match_ruleXMLRPC___ParametersKeyword_12_0_EqualsSignKeyword_12_1__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getRuleXMLRPCAccess().getParametersKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_12_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ResourceAdapter___AllowedTypesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_ResourceAdapter___AllowedTypesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceAdapter___BindingParametersKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ResourceAdapter___BindingParametersKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceAdapter___ConfigurationParametersKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_ResourceAdapter___ConfigurationParametersKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceAdapter___SupportedChildTypesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_ResourceAdapter___SupportedChildTypesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_rulSSH_commands___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q.equals(syntax))
				emit_rulSSH_commands___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ruleHTTP_URL___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q.equals(syntax))
				emit_ruleHTTP_URL___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ruleXMLRPC___ParametersKeyword_12_0_EqualsSignKeyword_12_1__q.equals(syntax))
				emit_ruleXMLRPC___ParametersKeyword_12_0_EqualsSignKeyword_12_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('Allowed Types' '{' '}')?
	 */
	protected void emit_ResourceAdapter___AllowedTypesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Binding Parameters' '{' '}')?
	 */
	protected void emit_ResourceAdapter___BindingParametersKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Configuration Parameters' '{' '}')?
	 */
	protected void emit_ResourceAdapter___ConfigurationParametersKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Supported Child Types' '{' '}')?
	 */
	protected void emit_ResourceAdapter___SupportedChildTypesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('<<' '>>')?
	 */
	protected void emit_rulSSH_commands___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('<<' '>>')?
	 */
	protected void emit_ruleHTTP_URL___LessThanSignLessThanSignKeyword_2_0_GreaterThanSignGreaterThanSignKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('parameters' '=')?
	 */
	protected void emit_ruleXMLRPC___ParametersKeyword_12_0_EqualsSignKeyword_12_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
