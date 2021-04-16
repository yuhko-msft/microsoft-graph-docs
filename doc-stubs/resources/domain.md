---
title: "domain resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# domain resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List domains](../api/domain-list.md)|[domain](../resources/domain.md) collection|Get a list of the [domain](../resources/domain.md) objects and their properties.|
|[Create domain](../api/domain-post-domains.md)|[domain](../resources/domain.md)|Create a new [domain](../resources/domain.md) object.|
|[Get domain](../api/domain-get.md)|[domain](../resources/domain.md)|Read the properties and relationships of a [domain](../resources/domain.md) object.|
|[Update domain](../api/domain-update.md)|[domain](../resources/domain.md)|Update the properties of a [domain](../resources/domain.md) object.|
|[Delete domain](../api/domain-delete.md)|None|Deletes a [domain](../resources/domain.md) object.|
|[List sharedEmailDomainInvitations](../api/domain-list-sharedemaildomaininvitations.md)|[sharedEmailDomainInvitation](../resources/sharedemaildomaininvitation.md) collection|Get the sharedEmailDomainInvitation resources from the sharedEmailDomainInvitations navigation property.|
|[Create sharedEmailDomainInvitation](../api/domain-post-sharedemaildomaininvitations.md)|[sharedEmailDomainInvitation](../resources/sharedemaildomaininvitation.md)|Create a new sharedEmailDomainInvitation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationType|String|**TODO: Add Description**|
|availabilityStatus|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAdminManaged|Boolean|**TODO: Add Description**|
|isDefault|Boolean|**TODO: Add Description**|
|isInitial|Boolean|**TODO: Add Description**|
|isRoot|Boolean|**TODO: Add Description**|
|isVerified|Boolean|**TODO: Add Description**|
|passwordNotificationWindowInDays|Int32|**TODO: Add Description**|
|passwordValidityPeriodInDays|Int32|**TODO: Add Description**|
|state|[domainState](../resources/domainstate.md)|**TODO: Add Description**|
|supportedServices|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|domainNameReferences|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|serviceConfigurationRecords|[domainDnsRecord](../resources/domaindnsrecord.md) collection|**TODO: Add Description**|
|sharedEmailDomainInvitations|[sharedEmailDomainInvitation](../resources/sharedemaildomaininvitation.md) collection|**TODO: Add Description**|
|verificationDnsRecords|[domainDnsRecord](../resources/domaindnsrecord.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.domain",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.domain",
  "id": "String (identifier)",
  "authenticationType": "String",
  "availabilityStatus": "String",
  "isAdminManaged": "Boolean",
  "isDefault": "Boolean",
  "isInitial": "Boolean",
  "isRoot": "Boolean",
  "isVerified": "Boolean",
  "passwordNotificationWindowInDays": "Integer",
  "passwordValidityPeriodInDays": "Integer",
  "state": {
    "@odata.type": "microsoft.graph.domainState"
  },
  "supportedServices": [
    "String"
  ]
}
```

