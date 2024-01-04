package models.animals;

import java.util.List;

public class CatFacts {

    private List<CatFact> catFactList;

    public List<CatFact> getCatFactList() {
        return catFactList;
    }

    public void setCatFactList(List<CatFact> catFactList) {
        this.catFactList = catFactList;
    }

    public static class CatFact {
        private Status status;
        private String _id;
        private String user;
        private String text;
        private int __v;
        private String source;
        private String updatedAt;
        private String type;
        private String createdAt;
        private boolean deleted;
        private boolean used;

        // default constructor
        public CatFact() {
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public boolean isDeleted() {
            return deleted;
        }

        public void setDeleted(boolean deleted) {
            this.deleted = deleted;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public static class Status {
            private boolean verified;
            private String feedback;
            private int sentCount;

            // default constructor
            public Status() {
            }

            public boolean isVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            public String getFeedback() {
                return feedback;
            }

            public void setFeedback(String feedback) {
                this.feedback = feedback;
            }

            public int getSentCount() {
                return sentCount;
            }

            public void setSentCount(int sentCount) {
                this.sentCount = sentCount;
            }
        }
    }
}
