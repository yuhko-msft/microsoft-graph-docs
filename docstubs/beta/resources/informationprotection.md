---
title: "informationProtection resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# informationProtection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                                 | Return Type                                                                                   | Description                                                                                     |
| :----------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------- |
| [List informationProtection](../api/informationprotection-list.md)                                     | [informationProtection](informationProtection.md) collection                                  | List properties and relationships of an informationProtection object.                           |
| [Create informationProtection](../api/informationprotection-create.md)                                 | [informationProtection](informationProtection.md)                                             | Create a new informationProtection object.                                                      |
| [Get informationProtection](../api/informationprotection-get.md)                                       | [informationProtection](informationProtection.md)                                             | Read properties and relationships of an informationProtection object.                           |
| [Update informationProtection](../api/informationprotection-update.md)                                 | [informationProtection](informationProtection.md)                                             | Update the properties of an informationProtection object.                                       |
| [Delete informationProtection](../api/informationprotection-delete.md)                                 |                                                                                               | Delete an informationProtection object.                                                         |
| [evaluateLabelsAndPolicies](../api/informationprotection-evaluateLabelsAndPolicies.md)                 | [evaluateLabelsAndPoliciesJobResponse](../resources/-evaluatelabelsandpoliciesjobresponse.md) |                                                                                                 |
| [List dataLossPreventionPolicies](../api/informationprotection-list-datalosspreventionpolicies.md)     | [dataLossPreventionPolicy](../resources/-datalosspreventionpolicy.md)                         | Get the dataLossPreventionPolicy objects from a dataLossPreventionPolicies navigation property. |
| [Create dataLossPreventionPolicies](../api/informationprotection-post-datalosspreventionpolicies.md)   | [dataLossPreventionPolicy](../resources/-datalosspreventionpolicy.md)                         | Create a new dataLossPreventionPolicy object.                                                   |
| [Get dataLossPreventionPolicies](../api/informationprotection-get-datalosspreventionpolicies.md)       | [dataLossPreventionPolicy](../resources/-datalosspreventionpolicy.md)                         | Read the properties and relationships of a dataLossPreventionPolicy object.                     |
| [Update dataLossPreventionPolicies](../api/informationprotection-update-datalosspreventionpolicies.md) | [dataLossPreventionPolicy](../resources/-datalosspreventionpolicy.md)                         | Update the properties of a dataLossPreventionPolicy object.                                     |
| [Delete dataLossPreventionPolicies](../api/informationprotection-delete-datalosspreventionpolicies.md) |                                                                                               | Delete a dataLossPreventionPolicy object.                                                       |
| [List sensitivityLabels](../api/informationprotection-list-sensitivitylabels.md)                       | [sensitivityLabel](../resources/-sensitivitylabel.md)                                         | Get the sensitivityLabel objects from a sensitivityLabels navigation property.                  |
| [Create sensitivityLabels](../api/informationprotection-post-sensitivitylabels.md)                     | [sensitivityLabel](../resources/-sensitivitylabel.md)                                         | Create a new sensitivityLabel object.                                                           |
| [Get sensitivityLabels](../api/informationprotection-get-sensitivitylabels.md)                         | [sensitivityLabel](../resources/-sensitivitylabel.md)                                         | Read the properties and relationships of a sensitivityLabel object.                             |
| [Update sensitivityLabels](../api/informationprotection-update-sensitivitylabels.md)                   | [sensitivityLabel](../resources/-sensitivitylabel.md)                                         | Update the properties of a sensitivityLabel object.                                             |
| [Delete sensitivityLabels](../api/informationprotection-delete-sensitivitylabels.md)                   |                                                                                               | Delete a sensitivityLabel object.                                                               |
| [List sensitivityPolicySettings](../api/informationprotection-list-sensitivitypolicysettings.md)       | [sensitivityPolicySettings](../resources/-sensitivitypolicysettings.md)                       | Get the sensitivityPolicySettings objects from a sensitivityPolicySettings navigation property. |
| [Create sensitivityPolicySettings](../api/informationprotection-post-sensitivitypolicysettings.md)     | [sensitivityPolicySettings](../resources/-sensitivitypolicysettings.md)                       | Create a new sensitivityPolicySettings object.                                                  |
| [Get sensitivityPolicySettings](../api/informationprotection-get-sensitivitypolicysettings.md)         | [sensitivityPolicySettings](../resources/-sensitivitypolicysettings.md)                       | Read the properties and relationships of a sensitivityPolicySettings object.                    |
| [Update sensitivityPolicySettings](../api/informationprotection-update-sensitivitypolicysettings.md)   | [sensitivityPolicySettings](../resources/-sensitivitypolicysettings.md)                       | Update the properties of a sensitivityPolicySettings object.                                    |
| [Delete sensitivityPolicySettings](../api/informationprotection-delete-sensitivitypolicysettings.md)   |                                                                                               | Delete a sensitivityPolicySettings object.                                                      |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship               | Type                                                                            | Description |
| :------------------------- | :------------------------------------------------------------------------------ | :---------- |
| dataLossPreventionPolicies | [dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) collection |             |
| sensitivityLabels          | [sensitivityLabel](../resources/sensitivitylabel.md) collection                 |             |
| sensitivityPolicySettings  | [sensitivityPolicySettings](../resources/sensitivitypolicysettings.md)          |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.informationProtection",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.informationProtection",
  "id": "String (identifier)"
}
```
