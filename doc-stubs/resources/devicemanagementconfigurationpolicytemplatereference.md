---
title: "deviceManagementConfigurationPolicyTemplateReference resource type"
description: "Policy template reference information"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicyTemplateReference resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Policy template reference information

## Properties
|Property|Type|Description|
|:---|:---|:---|
|templateDisplayName|String|Template Display Name of the referenced template. This property is read-only.|
|templateDisplayVersion|String|Template Display Version of the referenced Template. This property is read-only.|
|templateFamily|deviceManagementConfigurationTemplateFamily|Template Family of the referenced Template. This property is read-only. Possible values are: `none`, `endpointSecurityAntivirus`, `endpointSecurityDiskEncryption`, `endpointSecurityFirewall`, `endpointSecurityEndpointDetectionAndResponse`, `endpointSecurityAttackSurfaceReduction`, `endpointSecurityAccountProtection`, `endpointSecurityApplicationControl`.|
|templateId|String|Template id|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplateReference",
  "templateDisplayName": "String",
  "templateDisplayVersion": "String",
  "templateFamily": "String",
  "templateId": "String"
}
```

