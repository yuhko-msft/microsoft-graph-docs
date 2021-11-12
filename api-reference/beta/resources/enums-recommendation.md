---
title: "Recommendation enumeration values"
description: "Microsoft Graph recommendation enumeration values"
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: enumTypes
---

# Recommendation enum values

Namespace: microsoft.graph.recommendation

### category values
| Member | Value | Description             |
|:-------|:------|:------------------------|
| usageAndCompliance|0|Category of recommendations that address best practices related to usage and compliance.|
| security|1|Category of recommendations that address best practices related to security.|
| productivity|2|Category of recommendations that address best practices related to productivity.|
| health|3|Category of recommendations that address best practices related to health.|
| configuration|4|Category of recommendations that address best practices related to configuration.|
| unknownFutureValue|5|Placeholder value for future improvements.|

### priority
| Member | Value | Description             |
|:-------|:------|:------------------------|
| low | 0 | The recommendation is of low priority to address. |
| medium | 1 | The recommendation is of medium priority to address. |
| high | 2 | The recommendation is of high priority to address. |

### status
| Member | Value | Description             |
|:-------|:------|:------------------------|
| active | 0 | The recommendation is active. |
| completedBySystem | 1 | Microsoft detected the recommendation as completed. |
| completedByUser | 2 | A user completed the recommendation. |
| dismissed | 3 | The recommendation is dismissed. |
| postponed | 4 | The recommendation was postponed to a specified date and time. |
| unknownFutureValue | 5 | Placeholder for future improvements. |