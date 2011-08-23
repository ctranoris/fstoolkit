package org.panlab.software.fsdl2.serializer;

import com.google.inject.Inject;
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
import org.panlab.software.fsdl2.services.FSDLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractFSDLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FSDLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ResourceRequest___SettingsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_ServiceRequest_OptionalKeyword_6_2_q;
	protected AbstractElementAlias match_ServiceRequest___SettingsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FSDLGrammarAccess) access;
		match_ResourceRequest___SettingsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getResourceRequestAccess().getSettingsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getResourceRequestAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getResourceRequestAccess().getRightCurlyBracketKeyword_4_3()));
		match_ServiceRequest_OptionalKeyword_6_2_q = new TokenAlias(true, false, grammarAccess.getServiceRequestAccess().getOptionalKeyword_6_2());
		match_ServiceRequest___SettingsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getServiceRequestAccess().getSettingsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getServiceRequestAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getServiceRequestAccess().getRightCurlyBracketKeyword_7_3()));
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
			if(match_ResourceRequest___SettingsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ResourceRequest___SettingsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceRequest_OptionalKeyword_6_2_q.equals(syntax))
				emit_ServiceRequest_OptionalKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceRequest___SettingsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_ServiceRequest___SettingsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('settings' '{' '}')?
	 */
	protected void emit_ResourceRequest___SettingsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'optional'?
	 */
	protected void emit_ServiceRequest_OptionalKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('settings' '{' '}')?
	 */
	protected void emit_ServiceRequest___SettingsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
