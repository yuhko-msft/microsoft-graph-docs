---
title: "windowsDefenderApplicationControlSupplementalPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsDefenderApplicationControlSupplementalPolicy resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsDefenderApplicationControlSupplementalPolicies](../api/windowsdefenderapplicationcontrolsupplementalpolicy-list.md)|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) collection|Get a list of the [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) objects and their properties.|
|[Create windowsDefenderApplicationControlSupplementalPolicy](../api/windowsdefenderapplicationcontrolsupplementalpolicy-create.md)|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md)|Create a new [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object.|
|[Get windowsDefenderApplicationControlSupplementalPolicy](../api/windowsdefenderapplicationcontrolsupplementalpolicy-get.md)|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md)|Read the properties and relationships of a [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object.|
|[Update windowsDefenderApplicationControlSupplementalPolicy](../api/windowsdefenderapplicationcontrolsupplementalpolicy-update.md)|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md)|Update the properties of a [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object.|
|[Delete windowsDefenderApplicationControlSupplementalPolicy](../api/windowsdefenderapplicationcontrolsupplementalpolicy-delete.md)|None|Deletes a [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object.|
|[assign](../api/windowsdefenderapplicationcontrolsupplementalpolicy-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/windowsdefenderapplicationcontrolsupplementalpolicy-list-assignments.md)|[windowsDefenderApplicationControlSupplementalPolicyAssignment](../resources/windowsdefenderapplicationcontrolsupplementalpolicyassignment.md) collection|Get the windowsDefenderApplicationControlSupplementalPolicyAssignment resources from the assignments navigation property.|
|[Create windowsDefenderApplicationControlSupplementalPolicyAssignment](../api/windowsdefenderapplicationcontrolsupplementalpolicy-post-assignments.md)|[windowsDefenderApplicationControlSupplementalPolicyAssignment](../resources/windowsdefenderapplicationcontrolsupplementalpolicyassignment.md)|Create a new windowsDefenderApplicationControlSupplementalPolicyAssignment object.|
|[List windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../api/windowsdefenderapplicationcontrolsupplementalpolicy-list-deploysummary.md)|[windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md) collection|Get the windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary resources from the deploySummary navigation property.|
|[Create windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../api/windowsdefenderapplicationcontrolsupplementalpolicy-post-deploysummary.md)|[windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md)|Create a new windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary object.|
|[List deviceStatuses](../api/windowsdefenderapplicationcontrolsupplementalpolicy-list-devicestatuses.md)|[windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentstatus.md) collection|Get the windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus resources from the deviceStatuses navigation property.|
|[Create windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus](../api/windowsdefenderapplicationcontrolsupplementalpolicy-post-devicestatuses.md)|[windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentstatus.md)|Create a new windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Binary|The WindowsDefenderApplicationControl supplemental policy content in byte array format.|
|contentFileName|String|The WindowsDefenderApplicationControl supplemental policy content's file name.|
|creationDateTime|DateTimeOffset|The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded.|
|description|String|The description of WindowsDefenderApplicationControl supplemental policy.|
|displayName|String|The display name of WindowsDefenderApplicationControl supplemental policy.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity.|
|version|String|The WindowsDefenderApplicationControl supplemental policy's version.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[windowsDefenderApplicationControlSupplementalPolicyAssignment](../resources/windowsdefenderapplicationcontrolsupplementalpolicyassignment.md) collection|The associated group assignments for this WindowsDefenderApplicationControl supplemental policy.|
|deploySummary|[windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentsummary.md)|WindowsDefenderApplicationControl supplemental policy deployment summary.|
|deviceStatuses|[windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus](../resources/windowsdefenderapplicationcontrolsupplementalpolicydeploymentstatus.md) collection|The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy",
  "id": "String (identifier)",
  "content": "Binary",
  "contentFileName": "String",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String"
}
```

